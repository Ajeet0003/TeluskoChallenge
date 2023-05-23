import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductAddService {

  constructor(private http:HttpClient) { }


  public addProduct(product:any){
    return this.http.post("http://localhost:8080/addProduct",product,{responseType:'text' as 'json'});
  }

  public gelAllProduct(){
    return this.http.get("http://localhost:8080/getAllProduct");
  }


  public getProductByName(name:any){
    return this.http.get("http://localhost:8080/getProductByName/"+name);
  }

  public getAllProductOutOfWarranty(){
    return this.http.get("http://localhost:8080/getAllProductOutOfWarranty");
  }

}
