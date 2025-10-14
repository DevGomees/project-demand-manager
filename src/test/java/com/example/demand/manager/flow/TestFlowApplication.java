package com.example.demand.manager.flow;

import org.springframework.boot.SpringApplication;

public class TestFlowApplication {

	public static void main(String[] args) {
		SpringApplication.from(FlowApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
