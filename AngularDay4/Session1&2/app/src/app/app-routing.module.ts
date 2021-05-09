import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ViewEmpComponent } from './view-emp/view-emp.component';
import { EditEmpComponent } from './edit-emp/edit-emp.component';
import { QuantityIncrementComponent } from './quantity-increment/quantity-increment.component';
import { EditEmployeeTemplateDrivenComponent } from './edit-employee-template-driven/edit-employee-template-driven.component';
import { EditEmpReactiveComponent } from './edit-emp-reactive/edit-emp-reactive.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { AuthGuard } from './auth/auth.guard';
import { LoginComponent } from './login/login.component';
const routes: Routes = [
  { path: 'view', component: ViewEmpComponent },
  { path: 'edit', component: EditEmpComponent },
  { path: 'quantity', component: QuantityIncrementComponent },
  {
    path: 'editTemplateDriven',
    component: EditEmployeeTemplateDrivenComponent,
  },
  {
    path: 'editReactive/:id',
    component: EditEmpReactiveComponent,
    canActivate: [AuthGuard],
  },
  {
    path: 'employeeList',
    component: EmployeeListComponent,
  },
  {
    path: 'login',
    component: LoginComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  providers: [AuthGuard],
})
export class AppRoutingModule {}
