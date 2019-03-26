import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {SubscriptionsListComponent} from "./app/modules/subscriptions/components/subscriptionsList/subscriptionsList.component";
import {SubscriptionDetailsComponent} from "./app/modules/subscriptions/components/subscriptionDetails/subscriptionDetails.component";
import {RegistrationComponent} from "./app/modules/subscriptions/components/registration/registration.component";

const routes: Routes = [
  { path: 'subscriptions', component: SubscriptionsListComponent },
  { path: '', redirectTo: '/subscriptions',
  pathMatch: 'full'},
  { path: 'details/:id', component: SubscriptionDetailsComponent },
  { path: 'registration', component: RegistrationComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
