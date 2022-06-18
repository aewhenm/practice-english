import {Inject, Injectable} from '@angular/core';
import {HttpService} from '@core/http.service';
import {DOCUMENT} from '@angular/common';

@Injectable({
  providedIn: 'root'
})
export class WelcomePageService {

  private http: HttpService;

  constructor(private httpServiceCore: HttpService,
              @Inject(DOCUMENT) private document: Document) {
    this.http = httpServiceCore.setControllerPrefix('/company');
  }

}
