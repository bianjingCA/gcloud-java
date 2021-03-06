/*
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.datastore;

/**
 * A common interface for Value builders.
 *
 * @param <V> the data type that the {@code Value} object holds.
 * @param <P> the value type.
 * @param <B> the value type's associated builder.
 */
public interface ValueBuilder<V, P extends Value<V>, B extends ValueBuilder<V, P, B>> {

  ValueType getValueType();

  B mergeFrom(P other);

  boolean getExcludeFromIndexes();

  B excludeFromIndexes(boolean excludeFromIndexes);

  /**
   * Deprecated. This library preserves the field for backwards compatibility.
   */
  @Deprecated
  int getMeaning();

  /**
   * Deprecated. This library preserves the field for backwards compatibility.
   */
  @Deprecated
  B meaning(int meaning);

  V get();

  B set(V value);

  P build();
}
