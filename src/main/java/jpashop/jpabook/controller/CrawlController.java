package jpashop.jpabook.controller;

import jpashop.jpabook.service.CrawlService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class CrawlController {
    private final CrawlService crawlService;

    @GetMapping("/crawl")
    public void getCrawl() throws IOException {
        String url = "https://aibigdata-study.tistory.com/";
        crawlService.makeTitleUrl(url);
    }
}
