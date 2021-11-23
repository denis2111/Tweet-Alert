package ro.uaic.info.tweetalert.aop;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.lang.ref.*;
import com.runtimeverification.rvmonitor.java.rt.*;
import com.runtimeverification.rvmonitor.java.rt.ref.*;
import com.runtimeverification.rvmonitor.java.rt.table.*;
import com.runtimeverification.rvmonitor.java.rt.tablebase.AbstractIndexingTree;
import com.runtimeverification.rvmonitor.java.rt.tablebase.SetEventDelegator;
import com.runtimeverification.rvmonitor.java.rt.tablebase.TableAdopter.Tuple2;
import com.runtimeverification.rvmonitor.java.rt.tablebase.TableAdopter.Tuple3;
import com.runtimeverification.rvmonitor.java.rt.tablebase.IDisableHolder;
import com.runtimeverification.rvmonitor.java.rt.tablebase.IMonitor;
import com.runtimeverification.rvmonitor.java.rt.tablebase.DisableHolder;
import com.runtimeverification.rvmonitor.java.rt.tablebase.TerminatedMonitorCleaner;
import java.util.concurrent.atomic.AtomicInteger;

final class TweetClientSuffixMonitor_Set extends com.runtimeverification.rvmonitor.java.rt.tablebase.AbstractMonitorSet<TweetClientSuffixMonitor> {

TweetClientSuffixMonitor_Set(){
this.size = 0;
this.elements = new TweetClientSuffixMonitor[4];
}
final void event_controller(TweetalertApplication x) {
int numAlive = 0 ;
for(int i = 0; i < this.size; i++){
TweetClientSuffixMonitor monitor = this.elements[i];
if(!monitor.isTerminated()){
elements[numAlive] = monitor;
numAlive++;

monitor.event_controller(x);
}
}
for(int i = numAlive; i < this.size; i++){
this.elements[i] = null;
}
size = numAlive;
}
}

class TweetClientSuffixMonitor extends com.runtimeverification.rvmonitor.java.rt.tablebase.AbstractSynchronizedMonitor implements Cloneable, com.runtimeverification.rvmonitor.java.rt.RVMObject {
boolean matchProp1;
Vector<TweetClientMonitor> monitorList = new Vector<TweetClientMonitor>();
protected Object clone() {
try {
TweetClientSuffixMonitor ret = (TweetClientSuffixMonitor) super.clone();
ret.monitorList = new Vector<TweetClientMonitor>();
for(TweetClientMonitor monitor : this.monitorList){
TweetClientMonitor newMonitor = (TweetClientMonitor)monitor.clone();
ret.monitorList.add(newMonitor);
}
return ret;
}
catch (CloneNotSupportedException e) {
throw new InternalError(e.toString());
}
}

@Override
public final int getState() {
return -1;
}

final void event_controller(TweetalertApplication x) {
matchProp1 = false;
RVM_lastevent = 0;
HashSet monitorSet = new HashSet();
TweetClientMonitor newMonitor = new TweetClientMonitor();
monitorList.add(newMonitor);
Iterator it = monitorList.iterator();
while (it.hasNext()){
TweetClientMonitor monitor = (TweetClientMonitor)it.next();
final TweetClientMonitor monitorfinalMonitor = monitor;
monitor.Prop_1_event_controller(x);
if(monitorfinalMonitor.Prop_1_Category_match) {
monitorfinalMonitor.Prop_1_handler_match();
}
if(monitorSet.contains(monitor) || monitor.Prop_1_Category_match ) {
it.remove();
} else {
monitorSet.add(monitor);
}
}
}

// RVMRef_x was suppressed to reduce memory overhead


@Override
protected final void terminateInternal(int idnum) {
switch(idnum){
case 0:
break;
}
switch(RVM_lastevent) {
case -1:
return;
case 0:
//controller
return;
}
return;
}

}

class TweetClientMonitor implements Cloneable, com.runtimeverification.rvmonitor.java.rt.RVMObject {
protected Object clone() {
try {
TweetClientMonitor ret = (TweetClientMonitor) super.clone();
ret.Prop_1_stacks = new ArrayList<IntStack>();
for(int Prop_1_i = 0; Prop_1_i < this.Prop_1_stacks.size(); Prop_1_i++){
IntStack Prop_1_stack = this.Prop_1_stacks.get(Prop_1_i);
ret.Prop_1_stacks.add(Prop_1_stack.fclone());
}
return ret;
}
catch (CloneNotSupportedException e) {
throw new InternalError(e.toString());
}
}


/* %%_%_CFG_%_%% */ArrayList<IntStack> Prop_1_stacks = new ArrayList<IntStack>();
static int[][] Prop_1_gt = { { 0, -1,  }, { 0, 0,  }, { 0, -1,  },  };
;
static int[][][][] Prop_1_at = { { {  },  }, { { { 2,  },  },  }, { {  },  },  };
;
static boolean[] Prop_1_acc = { true, false, true, };
int Prop_1_cat; // ACCEPT = 0, UNKNOWN = 1, FAIL = 2
int Prop_1_event = -1;

class IntStack implements java.io.Serializable {
    int[] data;
    int curr_index = 0;
    public IntStack(){
        data = new int[32];
    }
    public String toString(){
        String ret = "[";
        for (int i = curr_index; i>=0; i--){
            ret += Integer.toString(data[i])+",";
        }
        return ret+"]";
    }
    public int hashCode() {
        return curr_index^peek();
    }
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof IntStack)) return false;
        IntStack s = (IntStack)o;
        if(curr_index != s.curr_index) return false;
        for(int i = 0; i < curr_index; i++){
            if(data[i] != s.data[i]) return false;
        }
        return true;
    }
    public IntStack(int size){
        data = new int[size];
    }
    public int peek(){
        return data[curr_index - 1];
    }
    public int pop(){
        return data[--curr_index];
    }
    public void pop(int num){
        curr_index -= num;
    }
    public void push(int datum){
        if(curr_index < data.length){
            data[curr_index++] = datum;
        } else{
            int len = data.length;
            int[] old = data;
            data = new int[len * 2];
            for(int i = 0; i < len; ++i){
                data[i] = old[i];
            }
            data[curr_index++] = datum;
        }
    }
    public IntStack fclone(){
        IntStack ret = new IntStack(data.length);
        ret.curr_index = curr_index;
        for(int i = 0; i < curr_index; ++i){
            ret.data[i] = data[i];
        }
        return ret;
    }
    public void clear(){
        curr_index = 0;
    }
}

boolean Prop_1_Category_match = false;

TweetClientMonitor() {
IntStack stack = new IntStack();
stack.push(-2);
stack.push(1);
Prop_1_stacks.add(stack);

}

final boolean Prop_1_event_controller(TweetalertApplication x) {
{
	}

Prop_1_event = 1;
if (Prop_1_cat != 2) {
    Prop_1_event--; 
    Prop_1_cat = 1; 
    for (int Prop_1_i = Prop_1_stacks.size()-1; Prop_1_i >=0; Prop_1_i--) {
        IntStack stack = Prop_1_stacks.get(Prop_1_i); 
        Prop_1_stacks.set(Prop_1_i,null); 
        while (stack != null) { 
            int s = stack.peek();
            if (s >= 0 && Prop_1_at[s][Prop_1_event].length >= 0) { 
                /* not in an error state and something to do? */
                for (int j = 0; j < Prop_1_at[s][Prop_1_event].length; j++) { 
                    IntStack tstack; 
                    if (Prop_1_at[s][Prop_1_event].length > 1){
                        tstack = stack.fclone(); 
                    } else{ 
                        tstack = stack; 
                    } 
                    switch (Prop_1_at[s][Prop_1_event][j].length) { 
                        case 1:/* Shift */
                            tstack.push(Prop_1_at[s][Prop_1_event][j][0]); 
                            Prop_1_stacks.add(tstack); 
                            if (Prop_1_acc[Prop_1_at[s][Prop_1_event][j][0]]) Prop_1_cat = 0; 
                            break;
                        case 2: /* Reduce */ 
                            tstack.pop(Prop_1_at[s][Prop_1_event][j][1]); 
                            int Prop_1_old = tstack.peek();
                            tstack.push(Prop_1_gt[Prop_1_old][Prop_1_at[s][Prop_1_event][j][0]]); 
                            Prop_1_stacks.add(Prop_1_i,tstack); 
                            break; 
                    } 
                } 
            }
            stack = Prop_1_stacks.get(Prop_1_i); 
            Prop_1_stacks.remove(Prop_1_i); 
        }
    } 
    if (Prop_1_stacks.isEmpty()) 
        Prop_1_cat = 2; 
};
Prop_1_Category_match = Prop_1_cat == 0;
return true;
}

final void Prop_1_handler_match (){
{
		System.err.println("Am apelat controller");
		this.reset();
	}

}

final void reset() {
Prop_1_stacks.clear();
IntStack stack = new IntStack();
stack.push(-2);
stack.push(1);
Prop_1_stacks.add(stack);
Prop_1_Category_match = false;
}

public final int hashCode() {
if(Prop_1_stacks.size() == 0) return 0;
return Prop_1_stacks.size() ^ Prop_1_stacks.get(Prop_1_stacks.size() - 1).hashCode();
}

public final boolean equals(Object o) {
if(o == null) return false;
if(! (o instanceof TweetClientMonitor)) return false ;
TweetClientMonitor m = (TweetClientMonitor) o;
if (Prop_1_stacks.size() != m.Prop_1_stacks.size()) return false;
for(int Prop_1_i = 0; Prop_1_i < Prop_1_stacks.size(); Prop_1_i++){
IntStack Prop_1_stack = Prop_1_stacks.get(Prop_1_i);
IntStack Prop_1_stack2 = m.Prop_1_stacks.get(Prop_1_i);
if(Prop_1_stack.curr_index != Prop_1_stack2.curr_index) return false;
for(int Prop_1_j = 0; Prop_1_j < Prop_1_stack.curr_index; Prop_1_j++){
if(Prop_1_stack.data[Prop_1_j] != Prop_1_stack2.data[Prop_1_j]) return false;
}
}
return true;
}

public static int getNumberOfEvents() {
return 1;
}

public static int getNumberOfStates() {
return 0;
}

}

public final class mopRuntimeMonitor implements com.runtimeverification.rvmonitor.java.rt.RVMObject {
private static com.runtimeverification.rvmonitor.java.rt.map.RVMMapManager mopMapManager;
static {
mopMapManager = new com.runtimeverification.rvmonitor.java.rt.map.RVMMapManager();
mopMapManager.start();
}

// Declarations for the Lock 
static final ReentrantLock mop_RVMLock = new ReentrantLock();
static final Condition mop_RVMLock_cond = mop_RVMLock.newCondition();

private static boolean TweetClient_activated = false;

// Declarations for Indexing Trees 
private static Object TweetClient_x_Map_cachekey_x;
private static TweetClientSuffixMonitor TweetClient_x_Map_cachevalue;
private static final MapOfMonitor<TweetClientSuffixMonitor> TweetClient_x_Map = new MapOfMonitor<TweetClientSuffixMonitor>(0);


public static int cleanUp() {
int collected = 0;
// indexing trees
collected += TweetClient_x_Map.cleanUpUnnecessaryMappings();
return collected;
}

// Removing terminated monitors from partitioned sets
static {
	TerminatedMonitorCleaner.start();
}
// Setting the behavior of the runtime library according to the compile-time option
static {
	RuntimeOption.enableFineGrainedLock(false);
}

public static final void controllerEvent(TweetalertApplication x) {
TweetClient_activated = true;
while (!mop_RVMLock.tryLock()) {
Thread.yield();
}

CachedWeakReference wr_x = null;
MapOfMonitor<TweetClientSuffixMonitor> matchedLastMap = null;
TweetClientSuffixMonitor matchedEntry = null;
boolean cachehit = false;
if ((x == TweetClient_x_Map_cachekey_x)) {
	matchedEntry = TweetClient_x_Map_cachevalue;
	cachehit = true;
}
else {
	wr_x = new CachedWeakReference(x);
	{
		// FindOrCreateEntry
		MapOfMonitor<TweetClientSuffixMonitor> itmdMap = TweetClient_x_Map;
		matchedLastMap = itmdMap;
		TweetClientSuffixMonitor node_x = TweetClient_x_Map.getNodeEquivalent(wr_x);
		matchedEntry = node_x;
	}
}
// D(X) main:1
if ((matchedEntry == null)) {
	if ((wr_x == null)) {
		wr_x = new CachedWeakReference(x);
	}
	// D(X) main:4
	TweetClientSuffixMonitor created = new TweetClientSuffixMonitor();
	matchedEntry = created;
	matchedLastMap.putNode(wr_x, created);
}
// D(X) main:8--9
matchedEntry.event_controller(x);

if ((cachehit == false)) {
	TweetClient_x_Map_cachekey_x = x;
	TweetClient_x_Map_cachevalue = matchedEntry;
}


mop_RVMLock.unlock();
}

}
