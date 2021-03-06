/*
 * The MIT License
 *
 * Copyright 2014 Markus Eschenbach.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package de.mes;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

/**
 *
 * @author esche
 */
@RunWith(Parameterized.class)
public class Module2Test {
    
    private final Module2 module;

    public Module2Test(Module2 module) {
        this.module = module;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
      return Arrays.asList(new Object[][] {
          { new Module2() },
      });
    } 

    
    @Test
    public void testReactorMethod(){
        Assert.assertEquals(Module2.MODULE_NAME,  this.module.reactorMethod());
    }
        
}
