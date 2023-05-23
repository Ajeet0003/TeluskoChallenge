import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductAddService } from '../product-add.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
 


    product: Product=new Product("","",0,"");
    message:any;
  
    constructor(private service:ProductAddService) { }
  
    ngOnInit() {
    }
    
  
    public registerNow(){
  let resp=this.service.addProduct(this.product);
  resp.subscribe((data)=>this.message=data);
    }

}
