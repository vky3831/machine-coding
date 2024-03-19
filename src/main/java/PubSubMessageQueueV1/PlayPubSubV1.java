package PubSubMessageQueueV1;


/**
 * For phonePe SDE-2 interviews, Machine coding round is initial round for screening. Here, one low level design question is asked and that needs to be solved in duration of 2 hours. The solution developed must be correct, satisfying all mentioned requirements, applying object oriented design principles and running code needs to be submitted at end of interview.
 *
 * I was asked to develop a message queueing system. Functional requirements of this system has been described below in detail.
 *
 * Create your own queue that will hold messages in form of JSON. Standard library queues were not allowed.
 * There was one publisher that can generate messages.
 * There are multiple subscribers that will listen messages satisfying a particular regex.
 * Subscribers should not be tightly coupled to system and can be added or removed at runtime.
 * When a subscriber is added to the system, it registers callback function along with it. And this callback function will be invoked in case some message arrives.
 * There can be dependency relationship among subscribers i.e if there are two subscribers say A and B and A knows that B has to listen and process first, then only A can listen and process. There was many-to-many dependency relationship among subscribers.
 * There must a retry mechanism for handling error cases when some exception occurs in listening/ processing messages, that must be retried.
 * All Object oriented design principles must be followed and requirements should be fulfilled. Design should be flexible and scalable.
 *
 * LINK: https://leetcode.com/discuss/interview-question/598134/phonepe-machine-coding-round-message-queuing-system
 */
public class PlayPubSubV1 {

}
