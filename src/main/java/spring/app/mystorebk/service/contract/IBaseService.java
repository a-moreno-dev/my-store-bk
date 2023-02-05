package spring.app.mystorebk.service.contract;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Set;

public interface IBaseService <E, D>{
    Page<E> getPage(Pageable pageable)  throws Exception;
    List<E> getList(Pageable pageable)  throws Exception;
    Set<E> getSet(Pageable pageable)  throws Exception;
    D getOne(Long iEntityId) throws Exception;
    D createOne(D oDto) throws Exception;
    D updateOne(D oDto, Long iEntityId) throws Exception;
    Boolean deleteOne(Long iEntityId) throws Exception;
}
