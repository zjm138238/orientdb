/*
 *
 *  *  Copyright 2014 Orient Technologies LTD (info(at)orientechnologies.com)
 *  *
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *       http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *  *
 *  * For more information: http://www.orientechnologies.com
 *
 */

package com.orientechnologies.orient.core.compression;

/**
 * Interface for compression. This interface is used to compress/uncompress at storage level. This can be used also to implement
 * encryption at rest.
 * 
 * @author Andrey Lomakin
 * @since 05.06.13
 */
public interface OCompression {
  byte[] compress(byte[] content);

  byte[] compress(byte[] content, final int offset, final int length);

  byte[] uncompress(byte[] content);

  byte[] uncompress(byte[] content, final int offset, final int length);

  String name();
}
