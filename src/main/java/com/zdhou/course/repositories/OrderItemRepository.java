package com.zdhou.course.repositories;

import com.zdhou.course.entities.OrderItem;
import com.zdhou.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
