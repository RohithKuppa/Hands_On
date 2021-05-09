import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ViewEmpComponent } from './view-emp/view-emp.component';
import { EditEmpComponent } from './edit-emp/edit-emp.component';
import { QuantityIncrementComponent } from './quantity-increment/quantity-increment.component';
import { EditEmployeeTemplateDrivenComponent } from './edit-employee-template-driven/edit-employee-template-driven.component';
import { EditEmpReactiveComponent } from './edit-emp-reactive/edit-emp-reactive.component';
const routes: Routes = [
  { path: 'view', component: ViewEmpComponent },
  { path: 'edit', component: EditEmpComponent },
  { path: 'quantity', component: QuantityIncrementComponent },
  {
    path: 'editTemplateDriven',
    component: EditEmployeeTemplateDrivenComponent,
  },
  {
    path: 'editReactive',
    component: EditEmpReactiveComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
