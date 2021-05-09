import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  loggedin: boolean;
  constructor() {}
  login() {
    console.log('set');
    this.loggedin = true;
  }
  logout() {
    this.loggedin = false;
  }
  isloggedIn(): boolean {
    return this.loggedin;
  }
}
