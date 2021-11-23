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
	pointcut TweetRepository_FeedbackRepository() : (call(* FeedbackRepository.*(..))) && MOP_CommonPointCut();
	before () : TweetRepository_FeedbackRepository() {
		mopRuntimeMonitor.FeedbackRepositoryEvent();
	}

	pointcut TweetRepository_TweetRepository() : (call(* TweetRepository.*(..))) && MOP_CommonPointCut();
	before () : TweetRepository_TweetRepository() {
		mopRuntimeMonitor.TweetRepositoryEvent();
	}

	pointcut TweetRepository_FeedbackService() : (call(* FeedbackService.*(..))) && MOP_CommonPointCut();
	before () : TweetRepository_FeedbackService() {
		mopRuntimeMonitor.FeedbackServiceEvent();
	}

	pointcut TweetRepository_TweetService() : (call(* TweetService.*(..))) && MOP_CommonPointCut();
	before () : TweetRepository_TweetService() {
		mopRuntimeMonitor.TweetServiceEvent();
	}

	pointcut TweetRepository_controller() : (call(* TweetsController.*(..))) && MOP_CommonPointCut();
	before () : TweetRepository_controller() {
		mopRuntimeMonitor.controllerEvent();
	}

}
