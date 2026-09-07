package com.shubham.portfolio.controller.publicapi;

import com.shubham.portfolio.dto.response.AboutResponse;
import com.shubham.portfolio.service.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public/about")
@RequiredArgsConstructor
public class PublicAboutController {

    private final AboutService aboutService;

    @GetMapping
    public AboutResponse getAbout() {
        return aboutService.getAbout();
    }
}
