package kz.penglish.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ok")
public class OkController {

  @GetMapping
  public ResponseEntity<String> ok() {
    return ResponseEntity.ok("OK!");
  }

}