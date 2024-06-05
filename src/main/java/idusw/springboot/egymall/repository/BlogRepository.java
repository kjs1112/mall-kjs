package idusw.springboot.egymall.repository;

import idusw.springboot.egymall.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface BlogRepository extends JpaRepository<BlogEntity, Long> { // interface 상속,

}
