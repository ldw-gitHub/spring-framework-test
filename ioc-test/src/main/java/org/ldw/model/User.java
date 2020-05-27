package org.ldw.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @description
 * @author: liudawei
 * @date: 2020/5/22 10:20
 */
@Component("user")
@Scope(scopeName = "prototype")
public class User {

}
