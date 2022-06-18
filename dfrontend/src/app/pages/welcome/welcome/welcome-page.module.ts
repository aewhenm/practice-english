import { NgModule } from '@angular/core';

import { WelcomePageRoutingModule } from './welcome-page-routing.module';
import { WelcomePage } from './welcome-page';
import { WelcomePageService } from './welcome-page.service';
import { CoreModule } from '@core/core.module';

const services = [
  WelcomePageService
];

@NgModule({
  declarations: [WelcomePage],
  imports: [
    CoreModule,
    WelcomePageRoutingModule
  ],
  providers: [services]
})
export class WelcomePageModule {
}
