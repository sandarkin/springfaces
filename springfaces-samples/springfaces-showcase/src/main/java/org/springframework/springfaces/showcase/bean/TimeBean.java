/*
 * Copyright 2010-2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.springfaces.showcase.bean;

import org.springframework.stereotype.Component;

/**
 * Simple Spring bean that can be used to obtain the current time.
 * 
 * @author Phillip Webb
 */
@Component
public class TimeBean {

	/**
	 * Returns the time.
	 * @return the current time in milliseconds
	 */
	public long getCurrentTimeMillis() {
		return System.currentTimeMillis();
	}

}
