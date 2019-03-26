import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {HttpService} from './services/http.service';
import {SubscriptionsShareService} from './services/subscriptionsShare.service';
import {UserIDService} from './services/userID.service';
import {SubscriptionService} from './services/subscription/subscription.service';
import {UserService} from "./services/user/user.service";
import {SubscriptionUnitService} from "./services/subscriptionUnit/subscriptionUnit.service";
import {BillingAccountService} from "./services/billingAccount/billingAccount.service";
import {SubscriptionsModule} from "./app/modules/subscriptions/subscriptions.module";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    SubscriptionsModule,
    HttpClientModule
  ],
  providers: [
    HttpService,
    SubscriptionsShareService,
    UserIDService,
    SubscriptionService,
    UserService,
    SubscriptionUnitService,
    BillingAccountService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
