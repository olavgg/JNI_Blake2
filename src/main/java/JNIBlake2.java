
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

import java.io.File;

public class JNIBlake2 {
    static {
        // jni_blake2.dll (Windows) or jni_blake2.so (Unixes)
        System.loadLibrary("jni_blake2");
    }

    protected JNIBlake2(){}

    public static JNIBlake2 getInstance(){
        return new JNIBlake2();
    }

    private native void blake2_init(File file);
    private native void blake2_update(byte[] bytes);
    private native void blake2_final(byte[] bytes);

    public void init(){

    }

    public void init(File file){
        blake2_init(file);
    }

    public void update(){

    }

    public void finalize(){

    }

    public String getHex(){
        return "";
    }
}