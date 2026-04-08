import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { Main } from './app.component';
import { Camera} from './camera/camera.component';

@NgModule({
  declarations: [
    Main,
    Camera
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [Main]
})
export class AppModule { }
