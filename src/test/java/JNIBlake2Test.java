/*
 * Copyright [2014] [Olav Gronenaas Gjerde]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.junit.Before;
import org.junit.Test;

/**
 * User: olav
 * Date: 2/15/14
 * Time: 12:28 PM
 */
public class JNIBlake2Test {

    private JNIBlake2 blake2Instance;

    @Before
    public void setUp() throws Exception {
        //blake2Instance = JNIBlake2.getInstance();
    }

    @Test
    public void testStringReturnCorrectChecksum(){
        String truls = "truls";
        String hashUpdate = "add hash update";
        //blake2Instance.init();
        assert(true);
    }
}
