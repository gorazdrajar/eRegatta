/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-06-05 16:09:48 UTC)
 * on 2013-06-18 at 20:48:55 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.regattaclassendpoint.model;

/**
 * Model definition for RegattaClass.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-api-java-client/wiki/Json">http://code.google.com/p/google-api-java-client/wiki/Json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RegattaClass extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String discipline;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String grade;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regattaClass;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regattaId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDiscipline() {
    return discipline;
  }

  /**
   * @param discipline discipline or {@code null} for none
   */
  public RegattaClass setDiscipline(java.lang.String discipline) {
    this.discipline = discipline;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getGrade() {
    return grade;
  }

  /**
   * @param grade grade or {@code null} for none
   */
  public RegattaClass setGrade(java.lang.String grade) {
    this.grade = grade;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public RegattaClass setId(java.lang.Integer id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRegattaClass() {
    return regattaClass;
  }

  /**
   * @param regattaClass regattaClass or {@code null} for none
   */
  public RegattaClass setRegattaClass(java.lang.String regattaClass) {
    this.regattaClass = regattaClass;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRegattaId() {
    return regattaId;
  }

  /**
   * @param regattaId regattaId or {@code null} for none
   */
  public RegattaClass setRegattaId(java.lang.String regattaId) {
    this.regattaId = regattaId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public RegattaClass setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public RegattaClass set(String fieldName, Object value) {
    return (RegattaClass) super.set(fieldName, value);
  }

  @Override
  public RegattaClass clone() {
    return (RegattaClass) super.clone();
  }

}
