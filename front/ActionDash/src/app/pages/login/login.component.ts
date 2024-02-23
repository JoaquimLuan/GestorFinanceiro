import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {FormBuilder, FormGroup, ReactiveFormsModule, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {LoginModel} from "../../models/LoginModel";
import {NgIf} from "@angular/common";

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [NgIf, ReactiveFormsModule],
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{

    loginForm!: FormGroup;

  constructor(private formBuilder: FormBuilder, private router: Router) {}


  ngOnInit(): void {
      this.loginForm =  this.formBuilder.group({
        email: ['', [Validators.required, Validators.email]],
        senha: ['', [Validators.required]]
      });
    }

    submitLogin() {
      debugger
      var dadosLogin =  this.loginForm.getRawValue() as LoginModel;
    }


}
