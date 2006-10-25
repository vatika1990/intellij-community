/*
 * Copyright (c) 2005 Your Corporation. All Rights Reserved.
 */
package com.intellij.util.xml;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Specifies name strategy (see {@link com.intellij.util.xml.DomNameStrategy}) for this type and its subtree in XML
 *
 * @author peter
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface NameStrategy {
  Class<? extends DomNameStrategy> value();
}
