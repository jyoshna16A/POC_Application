package com.example.hybrid_backend;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://139.59.7.229:8100")
public class BannerController {
	
	@GetMapping("/banners")
	public List<Map<String, String>> getBanners() {
	    return List.of(
	        Map.of(
	            "imageUrl", "/assets/banner1.jpeg",
	            "altText", "Christmas Offer Banner 1",
	            "link", "https://example.com/diwali-offer-1"
	        ),
	        Map.of(
	            "imageUrl", "/assets/banner2.jpeg",
	            "altText", "Christmas Offer Banner 2",
	            "link", "https://example.com/diwali-offer-2"
	        ),
	        Map.of(
		            "imageUrl", "/assets/banner3.jpeg",
		            "altText", "Christmas Offer Banner 3",
		            "link", "https://example.com/diwali-offer-2"
		        )
	    );
	}

}
