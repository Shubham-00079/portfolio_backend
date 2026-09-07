package com.shubham.portfolio.service;

import com.shubham.portfolio.dto.request.AboutRequest;
import com.shubham.portfolio.dto.response.AboutResponse;

public interface AboutService {

    AboutResponse saveAbout(AboutRequest request);

    AboutResponse getAbout();

    AboutResponse updateAbout(Long id, AboutRequest request);

    void deleteAbout(Long id);
}