{-# LANGUAGE CPP #-}
{-# OPTIONS_GHC -fno-warn-missing-import-lists #-}
{-# OPTIONS_GHC -fno-warn-implicit-prelude #-}
module Paths_ex1code (
    version,
    getBinDir, getLibDir, getDynLibDir, getDataDir, getLibexecDir,
    getDataFileName, getSysconfDir
  ) where

import qualified Control.Exception as Exception
import Data.Version (Version(..))
import System.Environment (getEnv)
import Prelude

#if defined(VERSION_base)

#if MIN_VERSION_base(4,0,0)
catchIO :: IO a -> (Exception.IOException -> IO a) -> IO a
#else
catchIO :: IO a -> (Exception.Exception -> IO a) -> IO a
#endif

#else
catchIO :: IO a -> (Exception.IOException -> IO a) -> IO a
#endif
catchIO = Exception.catch

version :: Version
version = Version [0,1,0,0] []
bindir, libdir, dynlibdir, datadir, libexecdir, sysconfdir :: FilePath

bindir     = "C:\\Users\\Krist\\Dokumenter\\Skole\\github\\exercises\\haskell\\ex1code\\.stack-work\\install\\c65308a3\\bin"
libdir     = "C:\\Users\\Krist\\Dokumenter\\Skole\\github\\exercises\\haskell\\ex1code\\.stack-work\\install\\c65308a3\\lib\\x86_64-windows-ghc-8.2.2\\ex1code-0.1.0.0-7bEi0oZDdYY9n52RPRdHAJ-ex1code-test"
dynlibdir  = "C:\\Users\\Krist\\Dokumenter\\Skole\\github\\exercises\\haskell\\ex1code\\.stack-work\\install\\c65308a3\\lib\\x86_64-windows-ghc-8.2.2"
datadir    = "C:\\Users\\Krist\\Dokumenter\\Skole\\github\\exercises\\haskell\\ex1code\\.stack-work\\install\\c65308a3\\share\\x86_64-windows-ghc-8.2.2\\ex1code-0.1.0.0"
libexecdir = "C:\\Users\\Krist\\Dokumenter\\Skole\\github\\exercises\\haskell\\ex1code\\.stack-work\\install\\c65308a3\\libexec\\x86_64-windows-ghc-8.2.2\\ex1code-0.1.0.0"
sysconfdir = "C:\\Users\\Krist\\Dokumenter\\Skole\\github\\exercises\\haskell\\ex1code\\.stack-work\\install\\c65308a3\\etc"

getBinDir, getLibDir, getDynLibDir, getDataDir, getLibexecDir, getSysconfDir :: IO FilePath
getBinDir = catchIO (getEnv "ex1code_bindir") (\_ -> return bindir)
getLibDir = catchIO (getEnv "ex1code_libdir") (\_ -> return libdir)
getDynLibDir = catchIO (getEnv "ex1code_dynlibdir") (\_ -> return dynlibdir)
getDataDir = catchIO (getEnv "ex1code_datadir") (\_ -> return datadir)
getLibexecDir = catchIO (getEnv "ex1code_libexecdir") (\_ -> return libexecdir)
getSysconfDir = catchIO (getEnv "ex1code_sysconfdir") (\_ -> return sysconfdir)

getDataFileName :: FilePath -> IO FilePath
getDataFileName name = do
  dir <- getDataDir
  return (dir ++ "\\" ++ name)
