package spring.app.mystorebk.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import spring.app.mystorebk.domain.entity.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long>, JpaSpecificationExecutor<OrderProduct> {
}