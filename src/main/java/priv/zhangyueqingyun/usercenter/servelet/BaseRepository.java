package priv.zhangyueqingyun.usercenter.servelet;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends CrudRepository<T, ID>{
  T findByUuid(String uuid);
}
