package mop;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

import java.lang.ref.*;
import org.aspectj.lang.*;

aspect BaseAspect {
	pointcut notwithin() :
	!within(sun..*) &&
	!within(java..*) &&
	!within(javax..*) &&
	!within(com.sun..*) &&
	!within(org.dacapo.harness..*) &&
	!within(org.apache.commons..*) &&
	!within(org.apache.geronimo..*) &&
	!within(net.sf.cglib..*) &&
	!within(mop..*) &&
	!within(javamoprt..*) &&
	!within(rvmonitorrt..*) &&
	!within(com.runtimeverification..*);
}

public aspect mopMonitorAspect implements com.runtimeverification.rvmonitor.java.rt.RVMObject {
	public mopMonitorAspect(){
	}

	// Declarations for the Lock
	static ReentrantLock mop_MOPLock = new ReentrantLock();
	static Condition mop_MOPLock_cond = mop_MOPLock.newCondition();

	pointcut MOP_CommonPointCut() : !within(com.runtimeverification.rvmonitor.java.rt.RVMObject+) && !adviceexecution() && BaseAspect.notwithin();
	pointcut TweetClient_client() : (call(* ImageClassifierClient.*(..)) || call(* NLPClassifierClient.*(..))) && MOP_CommonPointCut();
	before () : TweetClient_client() {
		mopRuntimeMonitor.clientEvent();
	}

	pointcut TweetClient_service() : (call(* WebServiceImpl.classify(..))) && MOP_CommonPointCut();
	before () : TweetClient_service() {
		mopRuntimeMonitor.serviceEvent();
	}

	pointcut TweetClient_controller() : (call(* TweetalertApplication.*(..))) && MOP_CommonPointCut();
	before () : TweetClient_controller() {
		mopRuntimeMonitor.controllerEvent();
	}

}
