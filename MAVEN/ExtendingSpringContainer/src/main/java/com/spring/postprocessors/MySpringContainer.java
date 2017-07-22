package com.spring.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MySpringContainer implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println(bean);
		// Class cls = bean.getClass();
		if (bean instanceof Test) {
			Test t = (Test) bean;
			t.myPostProcessBeforeInit();
		} else if (bean instanceof MyBean) {
			MyBean myBean = (MyBean) bean;
			myBean.myPostProcessBeforeInit();
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(bean);
		return bean;
	}

}
