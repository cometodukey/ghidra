/* ###
 * IP: GHIDRA
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
package ghidra.app.plugin.core.debug.service.model.interfaces;

import ghidra.dbg.target.TargetObject;
import ghidra.dbg.target.TargetStackFrame;
import ghidra.trace.model.stack.TraceStackFrame;
import ghidra.trace.model.thread.TraceThread;

@Deprecated(forRemoval = true, since = "11.3")
public interface ManagedStackRecorder {

	void offerStackFrame(TargetStackFrame added);

	void recordStack();

	int getSuccessorFrameLevel(TargetObject successor);

	TraceStackFrame getTraceStackFrame(TraceThread traceThread, int level);

	TargetStackFrame getTargetStackFrame(int frameLevel);

}
