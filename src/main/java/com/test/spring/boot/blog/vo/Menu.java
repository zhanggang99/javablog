package com.test.spring.boot.blog.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 菜单 值对象.
 */
@Data
@AllArgsConstructor
public class Menu implements Serializable{
 
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String url;

}
