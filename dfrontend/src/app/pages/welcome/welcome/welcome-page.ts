import { Component, OnInit } from '@angular/core';
import { WelcomePageService } from './welcome-page.service';

@Component({
  selector: 'app-login-page',
  templateUrl: './welcome-page.html',
  styleUrls: [
      './welcome-page.scss',
      './bootstrap.min.css',
  ]
})
export class WelcomePage implements OnInit {

  constructor(private loginService: WelcomePageService) {
  }

  ngOnInit(): void {
    console.log('welcome page init!')
  }

}
