import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule} from "@angular/forms";
import { FormsModule} from "@angular/forms";
import { CommonModule } from "@angular/common";

import { AppComponent } from './app.component';
import { LoginComponent } from "./pages/login/login.component";
import { AppRoutes } from "./app.routes";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutes,
    ReactiveFormsModule,
    FormsModule,
    CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
