package bj.highfiveuniversity.accessdbdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.highfiveuniversity.accessdbdata.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
