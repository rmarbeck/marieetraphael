import play.*;
import play.api.OptionalSourceMapper;
import play.api.UsefulException;
import play.api.routing.Router;
import play.http.DefaultHttpErrorHandler;
import play.mvc.Http.*;
import play.mvc.*;
import play.mvc.Http.RequestHeader;

import javax.inject.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import views.html.errors.*;

public class ErrorHandler extends DefaultHttpErrorHandler {

    @Inject
    public ErrorHandler(Configuration configuration, Environment environment,
                        OptionalSourceMapper sourceMapper, Provider<Router> routes) {
        super(configuration, environment, sourceMapper, routes);
    }

    protected CompletionStage<Result> onProdServerError(RequestHeader request, UsefulException exception) {
        return CompletableFuture.completedFuture(
                Results.internalServerError("A server error occurred: " + exception.getMessage())
        );
    }

    protected CompletionStage<Result> onForbidden(RequestHeader request, String message) {
        return CompletableFuture.completedFuture(
                Results.forbidden("You're not allowed to access this resource.")
        );
    }

	@Override
	public CompletionStage<Result> onClientError(RequestHeader arg0, int arg1,
			String arg2) {
		// TODO Auto-generated method stub
		return super.onClientError(arg0, arg1, arg2);
	}

	@Override
	public CompletionStage<Result> onServerError(RequestHeader arg0,
			Throwable arg1) {
		// TODO Auto-generated method stub
		return super.onServerError(arg0, arg1);
	}

	@Override
	protected CompletionStage<Result> onNotFound(RequestHeader arg0, String arg1) {
		return CompletableFuture.completedFuture(
                Results.notFound(notfound.render())
        );
	}
}