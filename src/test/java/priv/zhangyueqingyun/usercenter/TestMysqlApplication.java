package priv.zhangyueqingyun.usercenter;

import org.springframework.boot.SpringApplication;

public class TestMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.from(UserCenterApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
