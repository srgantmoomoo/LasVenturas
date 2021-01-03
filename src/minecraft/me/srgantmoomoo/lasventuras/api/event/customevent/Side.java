package me.srgantmoomoo.lasventuras.api.event.customevent;

public enum Side
{
    CLIENT,
    SERVER;

    public boolean isServer()
    {
        return !this.isClient();
    }

    public boolean isClient()
    {
        return this == CLIENT;
    }
}