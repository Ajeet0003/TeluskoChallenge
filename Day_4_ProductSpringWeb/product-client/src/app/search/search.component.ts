import { Component, OnInit } from '@angular/core';
import { ProductAddService } from '../product-add.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {


  products: any;
  name: any;

  constructor(private service: ProductAddService) { }


  // public delteUser(id:number){
  //  let resp= this.service.deleteUser(id);
  //  resp.subscribe((data)=>this.users=data);
  // }

  public getProductByName() {
    let resp = this.service.getProductByName(this.name);
    resp.subscribe((data) => this.products = data);
  }
  public getAllProductOutOfWarranty() {
    let resp = this.service.getAllProductOutOfWarranty();
    resp.subscribe((data) => this.products = data);
  }
  ngOnInit() {
    let resp = this.service.gelAllProduct();
    resp.subscribe((data) => this.products = data);
  }



}
