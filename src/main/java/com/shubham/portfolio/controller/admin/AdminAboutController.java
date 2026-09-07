package com.shubham.portfolio.controller.admin;

import com.shubham.portfolio.dto.request.AboutRequest;
import com.shubham.portfolio.dto.response.AboutResponse;
import com.shubham.portfolio.service.AboutService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/about")
@RequiredArgsConstructor
public class AdminAboutController {

    private final AboutService aboutService;

    @PostMapping
    public AboutResponse save(@Valid @RequestBody AboutRequest request) {
        return aboutService.saveAbout(request);
    }

    @GetMapping
    public AboutResponse get() {
        return aboutService.getAbout();
    }

    @PutMapping("/{id}")
    public AboutResponse update(
            @PathVariable Long id,
            @Valid @RequestBody AboutRequest request) {

        return aboutService.updateAbout(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        aboutService.deleteAbout(id);
    }
}