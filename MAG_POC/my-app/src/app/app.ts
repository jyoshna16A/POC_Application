import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [CommonModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('my-app');
   isVisible = true;
   allItems = ['Apple', 'Banana', 'Cherry', 'Date', 'Elderberry'];
  visibleItems: { name: string; time: string }[] = [];
  currentIndex = 0;

  ngOnInit(): void {
    const interval = setInterval(() => {
      if (this.currentIndex < this.allItems.length) {
        console.log("Items : " + this.currentIndex)
        const item = {
          name: this.allItems[this.currentIndex],
          time: new Date().toLocaleTimeString()
        };
        console.log("Value : " + item.name)
        this.visibleItems.push(item);
        this.currentIndex++;
      } else {
        clearInterval(interval); // Stop when all items are shown
      }
    }, 1000); // 5 seconds
  }

  toggleVisibility() {
    this.isVisible = !this.isVisible;
  }
}
