package priv.zhangyueqingyun.mysql;

import org.springframework.data.repository.CrudRepository;

import priv.zhangyueqingyun.mysql.User;

public interface UserRepository extends CrudRepository<User, Integer> {
  
}