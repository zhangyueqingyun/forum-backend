package priv.zhangyueqingyun.mysql;

import org.springframework.boot.SpringApplication;

public class TestMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.from(MysqlApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
