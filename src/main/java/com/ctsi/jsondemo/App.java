package com.ctsi.jsondemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/**
 * Hello world!
 *
 */
public class App {
	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Hello World!");
		
		Infos info = new Infos();
		info.setDesc("根目录只有一个属性就是我");
		
		Job job2 = new Job();
		job2.setName("Job-2");
		job2.setDescription("我是Job2");
		
		Job job3 = new Job();
		job3.setName("Job-3");
		job3.setDescription("我是一个空Job");
		
		List<Job> jobs = new ArrayList<>();
		jobs.add(job2);
		jobs.add(job3);
		
		info.setJobs(jobs);
		
		String result = JacksonUtil.bean2Json(info);
		System.out.println(result);
		
		Infos infos = JacksonUtil.json2Bean(result, Infos.class);
		System.out.println(infos);
		
	}
	
}
