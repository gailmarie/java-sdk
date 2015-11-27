/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 * 
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
package com.ibm.watson.developer_cloud.natural_language_classifier.v1;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classification;

public class NaturalLanguageClassifierExample {

  public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
    final NaturalLanguageClassifier service = new NaturalLanguageClassifier();
    service.setUsernameAndPassword("<username>", "<password>");

    // Call the service and get the classification
    final Classification classification = service.classify("<classifier-id>", "Is it sunny?");

    System.out.println(classification);
  }

}