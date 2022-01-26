package concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

public class CompletableFutureDemo1 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		
		
		CompletableFuture<String> future = CompletableFuture.supplyAsync(()-> "HELLO");
		
		assertEquals( "HELLO", future.get());
		
		assertEquals(true, future.isDone());
		
		
	}

}
