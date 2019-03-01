import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {SubscriptionsListComponent} from './components/subscriptionsList/subscriptionsList.component';
import {ButtonsModule} from 'ngx-bootstrap';
import {NgxPaginationModule} from 'ngx-pagination';
import {HeaderComponent} from './components/header/header.component';
import {RouterModule} from '@angular/router';
import {SubscriptionDetailsComponent} from './components/subscriptionDetails/subscriptionDetails.component';
import {RegistrationComponent} from './components/registration/registration.component';

@NgModule({
  imports: [
    CommonModule,
    ButtonsModule,
    NgxPaginationModule,
    RouterModule
  ],
  exports: [
    SubscriptionsListComponent,
    HeaderComponent,
    SubscriptionDetailsComponent,
    RegistrationComponent
  ],
  declarations: [
    SubscriptionsListComponent,
    HeaderComponent,
    SubscriptionDetailsComponent,
    RegistrationComponent
  ],
  providers: []
})
export class SubscriptionsModule {

}
