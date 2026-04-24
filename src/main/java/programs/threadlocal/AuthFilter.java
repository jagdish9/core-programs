package programs.threadlocal;

/*public class AuthFilter extends OncePerRequestFilter {

    protected void doFilterInternal() {
        try {
            String user = request.getHeader("user");
            UserContext.setUser(user);

            filterChain.doFilter(request, response);
        } finally {
            UserContext.clear(); // very important
        }
    }
}*/

//Each request thread has its own user