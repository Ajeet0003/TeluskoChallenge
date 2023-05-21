import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    List<Product> productList=new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }

    public List<Product> getAllProduct() {
        return productList;
    }

    public Product getProductByName(String name) {
        for (Product p : productList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public List<Product> getProductByText(String text) {
//        List<Product> productList1=new ArrayList<>();
//        for (Product p:productList){
//          String  name=p.getName().toLowerCase();
//            String  type=p.getType().toLowerCase();
//            String place=p.getPlace().toLowerCase();
//            if(name.contains(text.toLowerCase()) || type.contains(text.toLowerCase())|| place.contains(text.toLowerCase())){
//                productList1.add(p);
//            }
//        }
//        return productList1;
        /*Another way by Applying Stream Concept */
       return productList.stream().filter(p->p.getPlace().toLowerCase().contains(text.toLowerCase())||p.getType().toLowerCase().contains(text.toLowerCase())||p.getName().toLowerCase().contains(text.toLowerCase())).collect(Collectors.toList());
    }

    public List<Product> searchByPlace(String placeName) {
//        String place=placeName.toLowerCase();
//
//        List<Product> productList3=new ArrayList<>();
//        for (Product p:productList){
//            if(p.getPlace().toLowerCase().equals(place))
//                productList3.add(p);
//        }
//        return productList3;

        /*Another way by Applying Stream Concept */
        return  productList.stream().filter(p->p.getPlace().toLowerCase().equals(placeName.toLowerCase())).collect(Collectors.toList());

    }

    public List<Product> outOfWarranty() {

//        List<Product> productList4=new ArrayList<>();
//        for (Product p:productList){
//            if(p.getWarranty()<2023)
//                productList4.add(p);
//        }
//        return productList4;


        /*Another way by Applying Stream Concept */
        return  productList.stream().filter(p->p.getWarranty()<2023).collect(Collectors.toList());
   }

}
